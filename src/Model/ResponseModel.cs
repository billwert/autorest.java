// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

namespace AutoRest.Java.Model
{
    public sealed class ResponseModel
    {
        public string Name { get; }
        public string Package { get; }
        public string Description { get; }
        public IType HeadersType { get; }
        public IType BodyType { get; }

        public ResponseModel(string name, string package, string description, IType headersType, IType bodyType)
        {
            Name = name;
            Package = package;
            Description = description;
            HeadersType = headersType;
            BodyType = bodyType;
        }
    }
}